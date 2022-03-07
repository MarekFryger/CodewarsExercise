package codewars5kyu.TheHungerGamesZooDisaster;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheHungerGamesZooDisaster {
    public static String[] whoEatsWho(String zoo) {
        String[] animalsArray = zoo.split(",");
        List<String> animalsList = new ArrayList<>();
        for (String animal : animalsArray) {
            animalsList.add(animal);
        }
        String[] result = new String[animalsArray.length + 1];
        Map<String, List<String>> animals = new HashMap<>();
        animals.put("antelope", List.of("grass"));
        animals.put("big-fish", List.of("little-fish"));
        animals.put("bug", List.of("leaves"));
        animals.put("bear", List.of("bug", "chicken", "cow", "leaves", "sheep"));
        animals.put("chicken", List.of("bug"));
        animals.put("cow", List.of("grass"));
        animals.put("fox", List.of("chicken", "sheep"));
        animals.put("giraffe", List.of("leaves"));
        animals.put("lion", List.of("antelope", "cow"));
        animals.put("panda", List.of("leaves"));
        animals.put("sheep", List.of("grass"));
        result[0] = zoo;

        for (int i = 1; i < result.length-1; i++) {

            for (int j = 0; j < animalsList.size(); j++) {
                if (j == 0) {
                    if (animals.containsKey(animalsList.get(j))) {
                        boolean contains = animals.get(animalsList.get(j)).contains(animalsList.get(j + 1));
                        if (contains) {
                            result[i] = animalsList.get(j) + " eats " + animalsList.get(j + 1);
                            animalsList.remove(animalsList.get(j + 1));
                            j = 0;
                            break;
                        }
                    }
                }
                if (j > 0) {
                    if (animals.containsKey(animalsList.get(j))) {
                        boolean containsL = animals.get(animalsList.get(j)).contains(animalsList.get(j - 1));

                        if (containsL) {
                            result[i] = animalsList.get(j) + " eats " + animalsList.get(j - 1);
                            animalsList.remove(animalsList.get(j - 1));
                            j = 0;
                            break;

                        } else {
                            boolean containsR = animals.get(animalsList.get(j)).contains(animalsList.get(j + 1));
                            if (containsR) {
                                result[i] = animalsList.get(j) + " eats " + animalsList.get(j - 1);
                                animalsList.remove(animalsList.get(j - 1));
                                j = 0;
                                break;
                            }

                        }

                    }
                }
            }

        }
        result[result.length - 1] = animalsList.get(0);
        return result;
    }
}
