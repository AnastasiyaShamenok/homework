//Треугольник существует только тогда, когда сумма любых двух его сторонбольше третьей.
// Определить существует ли такой треугольник.
// Дано: a, b, c –стороны предполагаемого треугольника.
// Требуется сравнить длину каждогоотрезка-стороны с суммой двух других.
// Если хотя бы в одном случае отрезококажется больше суммы двух других,
// то треугольника с такими сторонами несуществует.


public class two {
    public static void main(String[] args) {
        int a=7;
        int b=8;
        int c=2;
        if (a<b+c && b<a+c && c<b+c) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
    }
}

