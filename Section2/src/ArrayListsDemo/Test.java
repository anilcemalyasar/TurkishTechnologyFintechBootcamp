package ArrayListsDemo;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        List<String> provinceList = new ArrayList<String>();
        provinceList.add("İstanbul");
        provinceList.add("İzmir");
        provinceList.add("Ankara");
        provinceList.add("Antalya");
        provinceList.add("Muğla");

        System.out.println("Number of provinces: " + provinceList.size());
        System.out.println("Index\tProvince");
        for (int i = 0 ; i < provinceList.size(); i++) {
            System.out.println(i+1 + "\t\t" + provinceList.get(i));
        }

        // foreach loop
        for (String province: provinceList) {
            System.out.println(province);
        }

        // sort the list in alphabetically ascending order (A to Z)
        Collections.sort(provinceList);

        // foreach loop
        System.out.println("\nSorted province list");
        for (String province: provinceList) {
            System.out.println(province);
        }

        // linear search province
        String key = "İstanbul";
        for (int i = 0; i < provinceList.size(); i++) {
            if (provinceList.get(i).equalsIgnoreCase(key)) {
                System.out.println("Element " + key + " found at index " + i);
                break;
            }
        }

        // binary search province
        key = "İzmir";
        int found = binarySearch(provinceList, key);
        if (found != 1) {
            System.out.println(key + " found at index " + found);
        }
        else {
            System.out.println(key + " not found in ArrayList");
        }



        // let's clear the list
        // provinceList.clear();
        // System.out.println("The size of the cleared list: " + provinceList.size());


        /*
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            numbers.add(i, sc.nextInt());
        }

        for (int num: numbers) {
            System.out.println(num);
        }

         */

    }

    public static int binarySearch(List<String> list, String x) {
        int l = 0, r = list.size() - 1;
        // Loop to implement Binary Search
        while (l <= r) {
            // Calculating mid
            int mid = l + (r-l) / 2;

            int res = x.compareTo(list.get(mid));
            // Check if x is present at mid
            if (res == 0) {
                return mid;
            }

            if (res > 0) {
                l = mid + 1;
            }

            else {
                r = mid - 1;
            }
        }
        return -1;
    }

}
