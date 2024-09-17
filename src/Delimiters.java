import java.util.ArrayList;
//I have neither given nor received unauthorized aid on this piece of work.
public class Delimiters {
    private final String openDel;
    private final String closeDel;

    public String getOpenDel() {
        return openDel;
    }

    public String getCloseDel() {
        return closeDel;
    }

    public Delimiters(String open, String close){
        this.openDel = open;
        this.closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] token) {
        ArrayList<String> delimiters = new ArrayList<>();
        for (String s : token) {
            if (s.equals(openDel)) {
                delimiters.add(openDel);
            }
            if (s.equals(closeDel)) {
                delimiters.add(closeDel);
            }
        }
        return delimiters;
    }
    public boolean isBalanced(ArrayList delimiters) {
        int hasOpen = 0;
        for (int i =0; i < delimiters.size(); i++){
            if (delimiters.get(i).equals(openDel)){
                hasOpen++;
            }
            else if (delimiters.get(i).equals(closeDel)){
                if (hasOpen <= 0) return false;
                else {
                    hasOpen--;
                }
            }
        }
        return (hasOpen==0);
    }


}
