import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MainMailer {

    public static void main(String[] args) {

        String[] names = {"Ann Jones", "Ann Jones Ph.D.", "Bob Jones M.D.",
                "Carol Jones", "Ed Green Ph.D.", "Ed Green M.D.", "Ed Black"};

        List<StringBuilder> population = getNames(names);
        Map<StringBuilder, Integer> counts = new TreeMap<>();
        population.forEach(s -> counts.merge(s, 1, Integer::sum));
        System.out.println(counts);

        StringBuilder annJonesPhd = new StringBuilder("Ann Jones Ph.D.");
        System.out.println("There are " + counts.get(annJonesPhd) + " records for " + annJonesPhd);

        List<StringBuilder> standardizedNames = standardizeNames(population);
        System.out.println(standardizedNames);
        System.out.println("There are " + counts.get(annJonesPhd) + " records for " + annJonesPhd);
    }

    private static List<StringBuilder> getNames(String[] names) {

        List<StringBuilder> list = new ArrayList<>();
        int index = 3;

        for (String name : names) {
            for (int i = 0; i < index; i++) {
                list.add(new StringBuilder(name));
            }
            index++;
        }

        return list;
    }

    private static List<StringBuilder> standardizeNames(List<StringBuilder> list) {
        List<StringBuilder> newList = new ArrayList<>();
        for (var name : list) {
            boolean isAdded = false;
            for (String suffix : new String[]{"Ph.D.", "M.D."}) {
                int index = name.indexOf(suffix);
                if (index > -1) {
                    newList.add(new StringBuilder(name.substring(0, index - 1)));
                    isAdded = true;
                    //name.replace(index - 1, index + suffix.length(), "");
                }
            }
            if (!isAdded){
                newList.add(name);
            }
            //
        }
        return newList;
    }
}
