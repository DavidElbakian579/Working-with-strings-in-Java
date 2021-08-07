/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasyntaxpro10l5;

/**
 *
 * @author David-pc
 */
public class Solution3 {
    /* 3
    Обновление пути
    Реализуй метод changePath(String, String) так, чтобы он заменял версию jdk в пути, 
    полученном первым параметром метода, на версию, полученную вторым параметром, и возвращал новый путь.
    Версия jdk начинается со строки "jdk" и заканчивается на "/".

    Пример:
    путь — "/usr/java/jdk1.8/bin"
    версия jdk — "jdk-13"

    Метод changePath(путь, версия jdk) должен вернуть путь — "/usr/java/jdk-13/bin".
    */
    
    public static void start() {
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }
    
    public static String changePath(String path, String jdk) {
        /*
        Первый вариант
        return path.replaceAll(jdk);
        ответ правильный, решение не проходит
         */

        /*
        Второй вариант
        int index1 = path.indexOf("jdk");
        int index2 = path.lastIndexOf("/");

        String first = path.substring(0, index1);
        String last = path.substring(index2);

        return first + jdk + last;
        ответ правильный, решение не проходит
        */

        int index1 = path.indexOf("jdk");
        int lastIndex = path.indexOf("/", index1);
        String oldJdk = path.substring(index1, lastIndex);

        return path.replace(oldJdk, jdk);
    }
    
}
