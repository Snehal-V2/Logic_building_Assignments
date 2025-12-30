// count frequency of given number
#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>


typedef int* IPTR;
bool Check(int Arr[], int iSize, int iNo)
{
    
    int iCnt = 0,iCount = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt] == iNo )
        {
            return true;
            
        }
       
    }

}

int main()
{
    int iNum = 0, iValue = 0;
    bool bRet = false;
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

    bRet = Check(ptr, iNum, iValue);

    if(bRet == true)
    {
        printf("The number is present \n");

    }
    else
    {
         printf("The number is not present \n");
        
    }

    free(ptr);
    return 0;
}