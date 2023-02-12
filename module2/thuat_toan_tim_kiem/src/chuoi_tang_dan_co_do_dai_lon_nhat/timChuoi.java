package chuoi_tang_dan_co_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class timChuoi {
    public static void main(String[] args) {
        Scanner inout = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String string = inout.nextLine();
        LinkedList<Character> list = new LinkedList<>();
        list.add(string.charAt(0));
        for (int i = 0; i < string.length() - 1; i++) {

            int j = i + 1;
            if (string.charAt(i) < string.charAt(j)) {
                list.add(string.charAt(j));

            }
            else {
                break;
            }
            }
            for (int k = 0; k < list.size(); k++) {
                System.out.println(list.get(k));
            }

        }

    }

