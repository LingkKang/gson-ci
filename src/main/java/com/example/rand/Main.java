package com.example.rand;

import java.io.FileReader;
import java.io.Reader;

import com.example.rand.Model.Data;
import com.google.gson.Gson;

public class Main {
    private static Data data;

    public static void main(String[] args) {
        Gson gson = new Gson();
        System.out.println("Hello World!");

        try (Reader reader = new FileReader("test.json")) {
            data = gson.fromJson(reader, Data.class);
            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
