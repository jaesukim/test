package exam.hash;

import java.util.ArrayList;
import java.util.HashMap;
/*
  HashMap ==> Key 와 Value를 쌍으로 저장하고 
        빠른 검색을 할 때 사용한다.
 */
public class HashMapTest {
 public static void main(String[] args) {
//선언부
  HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
  System.out.println(hashMap.isEmpty());  
  hashMap.put("홍길동", new Integer(75));
  System.out.println(hashMap.isEmpty());
  System.out.println(hashMap.size());
  
//자료 넣기
  hashMap.put("장길산", new Integer(60));
  hashMap.put("이순신", new Integer(99));
  hashMap.put("고주몽", new Integer(88)); 
  hashMap.put("을지문덕", new Integer(95));
  
// 자료 가져오기
  Integer obj = hashMap.get("이순신");
  System.out.println(obj);
  
//자료 삭제하기
  hashMap.remove("이순신");
  obj = hashMap.get("이순신");
  System.out.println(obj);
  
//자료 넣기
  hashMap.put("고주몽", new Integer(65));
  System.out.println(hashMap.size());
  System.out.println(hashMap.get("고주몽"));
  System.out.println("----------------------------");
  
  String name1 = new String("고주몽");
  String name2 = "고주몽";
  String name3 = new String("고주몽");
  System.out.println(name1.hashCode());
  System.out.println(name2.hashCode());
  System.out.println(name3.hashCode()); 
  System.out.println(name1 == name2);
  System.out.println(name1 == name3);
  System.out.println("----------------------------");
  /*
// 클래스 선언해서 클래스형을 넣어 관리 가능함.
  HashMap<String,Address> addressBook = new HashMap<String,Address>();
  Address address;
  
  address = new Address("홍길동", 25,'M', "010-111-1111", "argus10@hanmail.net", "하늘아래 땅위", 2);
  address.setMemo("의적입니다. 율도로 행방을 감추었어요");
  addressBook.put("홍길동", address);
  
  address = new Address("강감찬", 30,'F', "010-222-2222", "argus11@hanmail.net", "충무 앞바다", 3);
  address.setMemo("임진왜란때의 명장입니다.  노량해전에서 가슴 뚫렸어요.");
  addressBook.put("강감찬",address);
 
  address = new Address("이순신", 50,'M', "010-144-14444", "argus12@hanmail.net", "함경북도 산골짜기", 1);
  address.setMemo("귀주대첩에서 승리했어요.");
  addressBook.put("이순신",address);
  
  address = new Address("박주몽", 33,'F', "010-216-8792", "argus13@hanmail.net", "요동땅", 3);
  address.setMemo("고구려의 시조입니다. 서서노는 백제를 세웠지요.");
  addressBook.put("박주몽", address);
  
  System.out.println(addressBook.get("이순신"));*/
 }
}