///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package lesson05;
//
///**
// *
// * @author User
// */
//import java.util.*;
//
//public class Lesson05 {
//
//    public static void main(String[] args) {
//
////        WORKING WITH CONDITIONS
//        int attendees = 4;
//        boolean largeVenue;
//
//        if (attendees >= 5) {
//            largeVenue = true;
//            System.out.println("Large Venue needed");
//        } else {
//            largeVenue = false;
//            System.out.println("Large Venue NOT needed");
//        }
////WORKING WITH AN ARRAY OF ITEMS
////First method: (not recommended)
//        String itemDesc1 = "Shirt";
//        String itemDesc2 = "Trousers";
//        String itemDesc3 = "Scarf";
////
//////Second method: (recommended syntax)
//        String[] items = {"Shirt", "Trousers", "Scarf"};
//        System.out.println(Arrays.toString(items));
//        int[] numbers = {27, 12, 82, 70, 54, 1, 30, 34};
//        System.out.println(Arrays.toString(numbers));
//        String[] names = {"Mary", "Bob", "Carlos"};
//        System.out.println(Arrays.toString(names));
//        int[] ages = {25, 27, 48};
//        System.out.println(Arrays.toString(ages));
////  
////DECLARING & INITIALIZING AN ARRAY
//        int[] ages = new int[3]; //setting array capacity to 3 elements
//        ages[0] = 19;
//        ages[1] = 42;
//        ages[2] = 92;
//
//        String[] names = new String[3];
//        names[0] = "Mary";
//        names[1] = "Bob";
//        names[2] = "Carlos";
////
////System.out.println(names[0] + " is " + ages[1] + " years old.");
////PROCESSING AN ARRAY OF ITEMS
////processing string array
//
//        String[] names = {"George", "Jill", "Xinyl", "Ravi"};
//
//        for (String name : names) {
//            System.out.println("Name is " + name);
//        }
//
////using break with loops
//        int passmark = 12;
//        boolean passed = false; //note: default for boolean is false
//        int[] scores = {4, 6, 2, 8, 12, 35, 9};
//
//        for (int unitScore : scores) {
//            if (unitScore >= 12) {
//                passed = true;
//                break; //breaks as soon as code reaches a value that evaluates condition to true
//            }
//        }
//        System.out.println("Atleast one person passed? " + passed);
//
//    }
//}
