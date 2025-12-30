#include<stdio.h>
#include<stdlib.h>


typedef int* IPTR;
int CheckEvenOdd(int Arr[], int iSize, int *iOdd)
{
    int iEven = 0;
    *iOdd = 0;

    for (int iCount = 0; iCount < iSize; iCount++)
    {
        if (Arr[iCount] % 2 == 0)
        {
            iEven++;
        }
        else
        {
            (*iOdd)++;
        }
    }
    return iEven;
}

int main()
{
    int iNum = 0, iEven = 0, iOdd = 0;
   IPTR ptr = NULL;

    printf("Enter the size of array:\n");
    scanf("%d", &iNum);

    ptr = (int *)malloc(iNum * sizeof(int));
    if (ptr == NULL)
    {
        printf("Memory allocation failed\n");
        return -1;
    }

    printf("Enter %d elements:\n", iNum);
    for (int i = 0; i < iNum; i++)
        scanf("%d", &ptr[i]);

    iEven = CheckEvenOdd(ptr, iNum, &iOdd);

    printf("Frequency of even numbers: %d\n", iEven);
    printf("Frequency of odd numbers : %d\n", iOdd);

    free(ptr);
    return 0;
}