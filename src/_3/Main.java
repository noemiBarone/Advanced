package _3;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        exercise1();
        exercise2();
        exercise3();
    }


    /**
     * 1: Complete the function that removes any duplicates by using a set
     *    then recreates a new list of unique items
     *
     *   You can reset a list by using list = new ArrayList<>();
     */
    private static void exercise1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c"));

        Set<String> newList = new HashSet<>();

        newList.addAll(list);
        list = new ArrayList<>();
        list.addAll(newList);


        if (list.size() == 3) {
            System.out.println("Exercise 1: Success");
        } else {
            System.out.println("Exercise 1: Failed");
        }
    }

    /**
     * 2: Write a method that takes a List of Strings or a Set of Strings and returns a Set of Strings.
     *    the method should take a collection as a parameter
     */
    private static void exercise2() {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "kiwi", "banana");
        //Set<String> set = Set.of("apple", "banana");
        Set<String> set;
        set = generateList(list);
        for (String stringa : set){
            System.out.println(stringa);
        }
    }


    private static Set<String> generateList (List<String> list){
        Set<String> set = new HashSet<>();
        for(int i = 0; i < 2; i++){
            set.add(list.get(i));
        }
        return set;
    }







    /**
     * 3: Follow the instructions in the comments
     */
    private static void exercise3() {
        String str = "the fox and the lazy dog saw another fox with another not lazy dog";
        List<String> words = Arrays.stream(str.split(" ")).toList();
        Map<String, Integer> wordCount = new HashMap<>();

        // Write code to count the number of occurrences of each word in the String `words`
        // and store the counts in the Map `wordCount`, note you will need to first get the previous value
        // from the Map and then increment it by 1, if no previous value exists, use 0 as the previous value.
        int count = 0;
        for (String word : words){
            for (String nextWord : words){
                if (word.equals(nextWord) ){
                    count++;
                }
            }
            wordCount.put(word, count + 1);
            count = 0;
        }

        System.out.println(wordCount);
    }



    /**
     * 4: Answer the following questions
     *
     *    What is the best data structure to use in the following scenarios, chose either a List, Set or Map
     *    and explain why you chose that data structure.
     *
     *    1 - You want to store the students in order of their arrival
     *    Answer: LIST (Ho bisogno di poterlo ordinare)
     *
     *    2 - You want to store the students in a class and their grades
     *    Answer: MAP (Ho bisogno di una lista di stringhe e integer)
     *
     *    3 - You want to store the countries in the world in order of age
     *    Answer: Set (Li riordina per anno)
     *
     *    4 - You want to store the products available for purchase in an online store, along with their corresponding prices.
     *    Answer:MAP (Ho bisogno di una lista di stringhe e double)
     *
     *    5 - You want to store the employees at a company in the order you added them
     *    Answer:LIST (Ho bisogno di poterlo ordinare)
     *
     *    6 - You want to store the cities in a particular state, along with their populations.
     *    Answer:MAP (Ho bisogno di una lista di stringhe e numeri)
     *
     *    7 - You want to store the books in a library, along with their authors and publication dates.
     *    Answer: MAP (Ho bisogno di una mappa di due liste stringhe e localDate)
     *
     *    8 - You want to store the courses offered at a university, along with the professors teaching each course.
     *    Answer:MAP (Ho bisogno di una mappa di due liste di Stringhe)
     *
     *    9 - You want to store the movies in a movie rental store, along with their ratings and release dates.
     *    Answer:MAP (Ho bisogno di una mappa di stringhe, int e localDate)
     *
     *    10 - You want to store the flights available for booking on an airline, along with their destinations and departure times.
     *    Answer:MAP (Ho bisogno di una mappa di  stringhe e orari)
     *
     *    11 - You want to store the articles on a news website, along with their titles and publication dates.
     *    Answer:MAP (Ho bisogno di una mappa di stringhe e localDate)
     *
     *    12 - You want to store the songs in a music streaming service, along with their artists and album names.
     *    Answer: MAP (Ho bisogno di una mappa di tre liste di stringhe )
     */
}
