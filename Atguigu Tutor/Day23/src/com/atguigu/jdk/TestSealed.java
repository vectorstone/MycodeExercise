package com.atguigu.jdk;

/*
sealed是一个修饰符，可以用来修饰类,被sealed修饰的类必须要使用 permits 关键字指定有哪些子类!

sealed class Graphic permits Circle,Rectangle,Triangle   Graphic可以有三个子类
Graphic的子类随  必须要使用 final / sealed / non-sealed
final class Triangle extends Graphic
non-sealed class  Circle extends Graphic
sealed class Rectangle extends Graphic
 */
public class TestSealed {

}
