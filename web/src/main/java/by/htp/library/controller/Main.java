package by.htp.library.controller;

import by.htp.library.entity.User;

import java.lang.reflect.Field;

/**
 * Created by oxothuk1401 on 17.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        final Class<?> cla = User.class;
        User user = new User();
        Field field = null;
        try {
            field = cla.getDeclaredField("summa");

        field.setAccessible(true);
        System.out.println(field.getInt(user));
        field.setInt(user, 2323);
        System.out.println(field.getInt(user));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
