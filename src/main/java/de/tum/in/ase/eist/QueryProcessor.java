package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Alex";

        } else if (query.contains("plus")) {
            Pattern p = Pattern.compile("-?\\d+");
            Matcher m = p.matcher(query);

            var int1 = Integer.parseInt(m.group());
            var int2 = Integer.parseInt(m.group());
            return String.valueOf(int1+int2);

        } else if (query.contains("the largest")) {
            Pattern p = Pattern.compile("-?\\d+");
            Matcher m = p.matcher(query);

            var t = new ArrayList<Integer>();
            while (m.find()) {
                t.add(Integer.parseInt(m.group()));
            }

            int maxx = t.stream()
                    .mapToInt(v -> v)
                    .max().orElseThrow(NoSuchElementException::new);

            return String.valueOf(maxx);

        } else if (query.contains("name")) {
            return "Alex";

        } else if (query.contains("name")) {
            return "Alex";

        } else if (query.contains("name")) {
            return "Alex";

        } else if (query.contains("name")) {
            return "Alex";

        } else if (query.contains("name")) {
            return "Alex";

        }
        else { // TODO extend the programm here
            return "";
        }
    }
}
