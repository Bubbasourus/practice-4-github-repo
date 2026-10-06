import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.0
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;

    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * Solution to Question 3 Part II
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index) == true) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }

    /**
     * Solution to Question 3 Part II
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index) == true) {
            files.remove(index);
        }
    }

    /**
     * Solution to Question 1 Part II
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean checkIndex(int index)
    {
        if ((index < files.size())&&(index >= 0)){
            return true;
        } else {
            System.out.println("Valid input range for checkIndex method is 0 to 1 less than the return value of size method");
            return false;
        }
    }

    /**
     * Solution to Question 2 Part II
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean validIndex(int index)
    {
        if ((index < files.size())&&(index >= 0)){
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Solution to Question 4-7 Part II
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void listAllFiles(String arrayName)
    {
        Iterator<String> it = files.iterator();
        while (it.hasNext()) {
            String element = it.next();
            System.out.println(element);
        }
    }
    
    /**
     * Solution to Question 4-7 Part II
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void listWithIndex(String arrayName)
    {
        Iterator<String> it = files.iterator();
        while (it.hasNext()) {
            String element = it.next();
            System.out.println(element.indexOf(element) + element);
        }
    }
}
