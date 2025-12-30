// count the last occurance
#include<stdio.h>
#include<stdlib.h>



typedef int* IPTR;
int LastOccurance(int Arr[], int iSize, int iNo)
{
    
    int iCnt = 0,iCount = 0,i = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] == iNo )
        {  
            i = iCnt;
        }   
    }
    return i;

}

int main()
{
    int iNum = 0, iValue = 0,iRet = 0;
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
    {
        scanf("%d", &ptr[i]);
    }
    
    printf("Enter the number whose frequency is being calculated:\n");
    scanf("%d", &iValue);


    iRet = LastOccurance(ptr, iNum, iValue);
    printf("%d\n",iRet);

  
    free(ptr);
    return 0;
}