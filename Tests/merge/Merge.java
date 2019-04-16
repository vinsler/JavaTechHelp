package merge;

public class Merge {

    public int [] sortArray(int[] arrayA){ // сортировка Массива который передается в функцию
        // проверяем не нулевой ли он и не пустой ли?
        if (arrayA == null) {
            return null;
        }
        if (arrayA.length == 0) {
            return null;
        }
        // проверяем не 1 ли элемент в массиве?
        if (arrayA.length < 2) {
            return arrayA; // возврат в рекурсию в строки ниже см комменты.
        }
        // копируем левую часть от начала до середины
        int [] arrayB = new int[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);

        // копируем правую часть от середины до конца массива, вычитаем из длинны первую часть
        int [] arrayC = new int[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

        // рекурсией закидываем поделенные обе части обратно в наш метод, он будет крутится до тех пор,
        // пока не дойдет до 1 элемента в массиве, после чего вернется в строку и будет искать второй такой же,
        // точнее правую часть от него и опять вернет его назад
        arrayB = sortArray(arrayB); // левая часть возврат из рекурсии строкой return arrayA;
        arrayC = sortArray(arrayC); // правая часть возврат из рекурсии строкой return arrayA;

        // далее опять рекурсия возврата слияния двух отсортированных массивов
        return mergeArray(arrayB, arrayC);
    }

    public int [] mergeArray(int [] arrayB, int [] arrayC) { // сливаем 2 входящих массива
        int [] arrayMerge = new int[arrayB.length + arrayC.length]; // получаем длинну выходного массива
        int positionB = 0, positionC = 0; // определяем позиции для смещения в массивах через 1 проход
        for (int i = 0; i < arrayB.length + arrayC.length; i++){ // проходим от нуля до конца выходного массива
            if (positionC == arrayB.length){ // если закончился массив B
                arrayMerge[i] = arrayC[i - positionC]; // то заливаем инфу в выходной массив из массива C
                positionB++; // увеличиваем смещение массива B, т.к. берем данные из С
            } else if (positionB == arrayC.length){ // если закончился массив С
                arrayMerge[i] = arrayB[i - positionB]; // то заливаем инфу в выходной массив из массива В
                positionC++; // увеличиваем смещение массива С, т.к. берем данные из В
            } else if (arrayB[i - positionB] < arrayC[i - positionC]) { // если элемент B < C
                arrayMerge[i] = arrayB[i - positionB]; // то заливаем в выходной массив элемент из массива B
                positionC++; // увеличиваем смещение С, т.к. взяли элемент из массива В
            } else { // если элемент B > C
                arrayMerge[i] = arrayC[i - positionC]; // то заливаем в выходной массив элемент из массива С
                positionB++; // увеличиваем смещение В, т.к. взяли элемент из массива С.
            }
        }
        return  arrayMerge; // возвращаем отсортированный массив
    }

//    public static void main(String[] args) {
//        Merge testMerge = new Merge();
//        int [] at = testMerge.sortArray(new int [] {3, 2, 1});
//        for (int i = 0; i < at.length ; i++) {
//            System.out.print(at[i] + " ");
//        }
//    }
}