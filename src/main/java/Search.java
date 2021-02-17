import java.util.ArrayList;

public class Search {

    public boolean linearSearch(ArrayList<Integer> array, int searchNumber) {
        for (int i = 0 ; i < array.size(); i++){
           if ( array.get(i) == searchNumber ){
               return true;
           }
        }
        return false;
    }
    public boolean binarySearch(ArrayList<Integer> array, int searchNumber){
        if (array.size() == 0){
            return false;
        }
        int middleIndex = 0;
        if (array.size() >1){
            middleIndex = (int) Math.ceil((double) array.size() / 2);
        }

        int midpoint = array.get(middleIndex);

        if (searchNumber == midpoint){
            return true;
        }

        ArrayList<Integer> newSearchArea;

        if (searchNumber < midpoint){
            newSearchArea = new ArrayList<Integer>(array.subList(0, middleIndex -1));
        }
        else{
            newSearchArea = new ArrayList<Integer>(array.subList(middleIndex + 1, array.size()));
        }
        return binarySearch(newSearchArea, searchNumber);

    }
}
