package com.globant.exercices;

public class ArrayCopiaInversa {

    public static void main(String[] args) {

                int[] array = {355, 850, 2134, 12, 867, 1676, 23, 24};
                int[] tempArray = new int[array.length];

                for (int i = 0; i < array.length; i++) {
                    tempArray[i] = array[array.length-(i+1)];
                }

                array = tempArray;

                for (int i:array) {
                    System.out.println(i);;
                }
            }

    }

