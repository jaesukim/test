package exam.hash;

import java.util.ArrayList;
import java.util.HashMap;
/*
  HashMap ==> Key �� Value�� ������ �����ϰ� 
        ���� �˻��� �� �� ����Ѵ�.
 */
public class HashMapTest {
 public static void main(String[] args) {
//�����
  HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
  System.out.println(hashMap.isEmpty());  
  hashMap.put("ȫ�浿", new Integer(75));
  System.out.println(hashMap.isEmpty());
  System.out.println(hashMap.size());
  
//�ڷ� �ֱ�
  hashMap.put("����", new Integer(60));
  hashMap.put("�̼���", new Integer(99));
  hashMap.put("���ָ�", new Integer(88)); 
  hashMap.put("��������", new Integer(95));
  
// �ڷ� ��������
  Integer obj = hashMap.get("�̼���");
  System.out.println(obj);
  
//�ڷ� �����ϱ�
  hashMap.remove("�̼���");
  obj = hashMap.get("�̼���");
  System.out.println(obj);
  
//�ڷ� �ֱ�
  hashMap.put("���ָ�", new Integer(65));
  System.out.println(hashMap.size());
  System.out.println(hashMap.get("���ָ�"));
  System.out.println("----------------------------");
  
  String name1 = new String("���ָ�");
  String name2 = "���ָ�";
  String name3 = new String("���ָ�");
  System.out.println(name1.hashCode());
  System.out.println(name2.hashCode());
  System.out.println(name3.hashCode()); 
  System.out.println(name1 == name2);
  System.out.println(name1 == name3);
  System.out.println("----------------------------");
  /*
// Ŭ���� �����ؼ� Ŭ�������� �־� ���� ������.
  HashMap<String,Address> addressBook = new HashMap<String,Address>();
  Address address;
  
  address = new Address("ȫ�浿", 25,'M', "010-111-1111", "argus10@hanmail.net", "�ϴþƷ� ����", 2);
  address.setMemo("�����Դϴ�. ������ ����� ���߾����");
  addressBook.put("ȫ�浿", address);
  
  address = new Address("������", 30,'F', "010-222-2222", "argus11@hanmail.net", "�湫 �չٴ�", 3);
  address.setMemo("�����ֶ����� �����Դϴ�.  �뷮�������� ���� �շȾ��.");
  addressBook.put("������",address);
 
  address = new Address("�̼���", 50,'M', "010-144-14444", "argus12@hanmail.net", "�԰�ϵ� ���¥��", 1);
  address.setMemo("���ִ�ø���� �¸��߾��.");
  addressBook.put("�̼���",address);
  
  address = new Address("���ָ�", 33,'F', "010-216-8792", "argus13@hanmail.net", "�䵿��", 3);
  address.setMemo("������ �����Դϴ�. ������� ������ ��������.");
  addressBook.put("���ָ�", address);
  
  System.out.println(addressBook.get("�̼���"));*/
 }
}