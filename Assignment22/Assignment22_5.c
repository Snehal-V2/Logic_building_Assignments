// count frequency of given number 11
#include<stdio.h>
#include<stdlib.h>


typedef int* IPTR;
int CountFrequency(int Arr[], int iSize, int iNo)
{
    
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    
    int iCnt = 0,iCount = 0;
    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
    if(Arr[iCnt] == iNo )
    {
        iCount++;
    }
}
   return iCount;

}

int main()
{
    int iNum = 0, i = 0,iRet;
   IPTR ptr = NULL;
    i = 11;

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
    {
        scanf("%d", &ptr[i]);
    }
    
    

    iRet = CountFrequency(ptr, iNum, i);
    printf("The frequency of given number is %d",iRet);

    free(ptr);
    return 0;
}