public class StringManipulator {
    public String trimAndConcat(String word1, String word2){
        String newresult = word1.trim()+word2.trim();
        return newresult;
    }
    public Integer getIndexOrNull(String targeta, char letter){
        Integer position = targeta.indexOf(letter);
        if(position == -1){
            position = null;
        }
        return position;
    }
    public Integer getIndexOrNull(String targetword, String searchword){
        Integer result = targetword.indexOf(searchword);
        if(result == -1){
            result = null;
        }
        return result;
    }
    public String concatSubstring(String worda, Integer start, Integer end, String wordb){
        String newresults = worda.substring(start, end)+wordb;
        return newresults;
    }
}