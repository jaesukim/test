

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MagicianList implements Iterable<String> {
 private List<String> list = new ArrayList<String>();
 
 public void add(String name){
  list.add(name);
 }
 
 public Iterator<String> iterator() {
  return  new Iterator<String>(){
   int seq = 0;
   public boolean hasNext() {
    return  seq < list.size();
   }
   public String next() {
    return list.get(seq++);
   }
   public void remove() {
        throw new UnsupportedOperationException();
   }
  };
 }
 
 
 public static void main(String[] arg){
  MagicianList magicians = new MagicianList();
  magicians.add("ÀÌÀº°á");
  magicians.add("Kevin parker");
  magicians.add("David Blaine");
  
  Iterator<String> iterator = magicians.iterator();
  while (iterator.hasNext()) {
   String element = iterator.next();
   System.out.println(element);
  }
 }
}