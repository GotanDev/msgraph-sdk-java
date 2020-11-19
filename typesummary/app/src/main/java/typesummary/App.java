/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package typesummary;

import com.microsoft.graph.models.extensions.User;

import java.util.Set;
import java.util.stream.Collectors;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.google.common.reflect.ClassPath.ClassInfo;
import com.google.common.reflect.ClassPath;

public class App {
    // -o absolutepathpath.txt to output to text file instead of console
    public static void main(String[] args) throws Exception {
        final String[] mNames = { //those are default java language methods that every object will have
            "equals",
            "getClass",
            "hashCode",
            "notify",
            "notifyAll",
            "toString",
            "wait"
        };
        methodsNameToSkip = Arrays.asList(mNames);
        final Boolean isFileMode = args.length > 0 && args[0].equals("-o");

        final ILogWriter writer = isFileMode ? new TextFileLogWriter(args[1]) : new ConsoleLogWriter();

        
        final List<String> classNames = getOrderedClassNames();
        serializeEnums(writer, classNames);
        serializeClasses(writer, classNames);
        serializeInterfaces(writer, classNames);

        if(isFileMode) {
            ((TextFileLogWriter)writer).flush();
        }
    }
    private static void serializeEnums(final ILogWriter writer, final List<String> classNames) throws Exception {
        for (String c : classNames) {
            Class<?> clazz = Class.forName(c);
            if(clazz.isEnum()) {
                writer.write("enum " + clazz.getName());
                serializeEnumValue(clazz.getEnumConstants(), writer);
            }
        }
    }
    private static void serializeEnumValue(final Object[] enumVals, final ILogWriter writer) {
        for(Object enumVal: enumVals) {
            writer.write(enumVal.toString(), 2);
        }
    }
    private static List<String> getOrderedClassNames() throws Exception {
        final Set<ClassInfo> classInfos = ClassPath.from(User.class.getClassLoader()).getTopLevelClassesRecursive("com.microsoft.graph");
        final List<String> classNames = classInfos.stream()
                                            .map(classInfo -> classInfo.getName())
                                            .distinct()
                                            .collect(Collectors.toList());
        classNames.sort(Comparator.naturalOrder());
        return classNames;
    }
    private static void serializeInterfaces(final ILogWriter writer, final List<String> classNames) throws Exception {
        for (String c : classNames) {
            Class<?> clazz = Class.forName(c);
            if(clazz.isInterface()) {
                String classHeadLine = "interface " + clazz.getName();
                Class<?> superClass = clazz.getSuperclass();
                if(superClass != null && superClass != Object.class) {
                    classHeadLine += " : " + superClass.getName();
                }
                writer.write(classHeadLine);
                serializeFields(clazz, writer);
                serializeMethods(clazz, writer);
            }
        }
    }
    private static void serializeClasses(final ILogWriter writer, final List<String> classNames) throws Exception {
        for (String c : classNames) {
            Class<?> clazz = Class.forName(c);
            if(!clazz.isEnum() && !clazz.isInterface()) {
                String classHeadLine = "class " + clazz.getName();
                Class<?> superClass = clazz.getSuperclass();
                if(superClass != null && superClass != Object.class) {
                    classHeadLine += " : " + superClass.getName();
                }
                writer.write(classHeadLine);
                serializeFields(clazz, writer);
                serializeMethods(clazz, writer);
            }
        }
    }
    private static void serializeFields(final Class<?> clazz, final ILogWriter writer) {
        final Field[] fields = clazz.getFields();
        Arrays.sort(fields, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        for(Field field : fields) {
            writer.write("property " + field.getName() + " : " + field.getType().getName(), 2);
        }
    }
    private static List<String> methodsNameToSkip;
    private static void serializeMethods(final Class<?> clazz, final ILogWriter writer) {
        final Method[] methods = clazz.getMethods();
        Arrays.sort(methods, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        for(Method method : methods) {
            if(!methodsNameToSkip.contains(method.getName())) {
                writer.write("method " + method.getName(), 2);
                writer.write("return type " +method.getReturnType().getName(), 4);
                serializeParameters(method, writer);
            }
        }
    }
    private static void serializeParameters(final Method method, final ILogWriter writer) {
        for(Parameter parameter: method.getParameters()) {
            writer.write("param " + parameter.getName() + " : " + parameter.getType().getName(), 4);
        }
    }
}