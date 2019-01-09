package Model;

import java.util.Scanner;

public class DNF {
    int matrix[][];
    int n = 0; //stolbi
    int m = 0; //stroki
    int lastLine = 0;

    public void initMatrix() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите разменость матрицы");
        System.out.print("Введите кол-во строк: ");
        n = in.nextInt();
        lastLine = n;
        System.out.print("Введите кол-во столбцов: ");
        m = in.nextInt();
        matrix = new int[n*n*n][m];

        for (int i = 0; i < n; i++) {
            System.out.println("Введите значения: ");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public void transformMatrix() {

        for (int i = 0; i < n*n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                    for (int k = 0; k < m; k++) {
                        matrix[lastLine][k]=matrix[i][k];
                    }
                    matrix[lastLine][j]=1;
                    lastLine++;
                }
            }
        }

        System.out.println("-----------");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }



    }


    private void addLine(int[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                /// buffer[i][j] = matrix[i][j];
            }
        }
    }

}
