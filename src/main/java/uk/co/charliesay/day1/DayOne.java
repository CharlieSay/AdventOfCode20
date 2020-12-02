package uk.co.charliesay.day1;

import uk.co.charliesay.AbstractDay;
import uk.co.charliesay.helpers.FileHelper;

import java.util.List;

public class DayOne extends AbstractDay {

    private List<Integer> integerList = FileHelper.fileToIntegerList(getFilePath());

    @Override
    public String partOne() {
        for (int l1 = 0; l1 < integerList.size() - 1; l1++) {
            for (int l2 = l1 + 1; l2 < integerList.size(); l2++) {
                if (integerList.get(l1) + integerList.get(l2) == 2020) {
                    return String.valueOf(integerList.get(l1) * integerList.get(l2));
                }
            }
        }
        return null;
    }

    @Override
    public String partTwo() {
        for (int l1 = 0; l1 < integerList.size() - 2; l1++) {
            for (int l2 = l1 + 1; l2 < integerList.size() - 1; l2++) {
                for (int l3 = l2 + 1; l3 < integerList.size(); l3++) {
                    if (integerList.get(l1) + integerList.get(l2) + integerList.get(l3) == 2020) {
                        return String.valueOf((long) integerList.get(l1) * integerList.get(l2) * integerList.get(l3));
                    }
                }
            }
        }
        return null;
    }

    @Override
    public String solutionsTogether() {
        return null;
    }

    @Override
    public String getFilePath() {
        return "./src/main/resources/day1/day1-resource.txt";
    }

    @Override
    public Integer getDay() {
        return 1;
    }
}
