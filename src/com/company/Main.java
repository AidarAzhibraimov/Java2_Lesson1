package com.company;

public class Main {

    public static void main(String[] args) {
        Father father = new Father("Michail",29, professionEnum.MANAGER);
        Son son1 = new Son("Stepan",19, professionEnum.STUDENT);
        Son son2 = new Son("Kiril",19, professionEnum.STUDENT);

        father.goingWork(10);
        son1.goingWork(10,"sun");
        son2.goingWork(12);
        System.out.println(father.getInfo());
        System.out.println(son1.getInfo());
        System.out.println(son2.getInfo());
	/*Основное
a) Доделать все пункты практического задания по презентации
b) Создать иерархию из 3х классов (1й -> 2й -> 3й уровень иерархии),
 последний 3й класс сделать не наследуемым
c) Все поля классов должны быть приватными, одно из полей должно быть
 сложного типа созданного вами же (4й класс), одно из полей сделать сложного типа (enum)
d) В классах не должно быть setter-ов, только getter-ы и конструкторы
e) Добавить перегруженные методы (2-3 шт.) в класс 2-го уровня иерархии,
 один из них сделать неперезаписываемым
f) В классе 3-го уровня перезаписать один из методов родителя
g) В главном классе (Main) Создать объект класса 2-го уровня (objectA) и
2 объекта класса 3-го уровня (objectB, objectC), также распечатать все свойства объектов и
вызвать перегруженные методы через каждый из экземпляров ваших объектов.*/
    }
}
