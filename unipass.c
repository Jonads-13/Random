#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, char** argv)
{
    int row = atoi(argv[1]);
    int col = atoi(argv[2]);
    int rowMulti = atoi(argv[3]);
    int colMulti = atoi(argv[4]);

    int** array = (int**)malloc(sizeof(int*) * row);

    int i;
    int j;

    printf("%s\n", argv[0]);

    for(i = 0; i < row; i++)
    {
        array[i] = (int*)malloc(sizeof(int) * col);
    }

    
    for(i = 0; i < row; i++)
    {
        for(j = 0; j < col; j++)
        {
            array[i][j] = (i * rowMulti) + (j * colMulti);
        }
    }

    for(i = 0; i < row; i++)
    {
        for(j = 0; j < col; j++)
        {
            printf("%d ", array[i][j]);
        }
        printf("\n");
    }


    return 0;
}
