// count the frequency of number

#include<stdio.h>
#include<stdlib.h>

typedef int* IPTR;

int CountFrequency(int Arr[],int iSize,int iNo)
{
    int ifreq = 0,iCount=0;
    for (iCount = 0; iCount < iSize; iCount++)
    {
        if(Arr[iCount] == iNo)
        {
            ifreq++;
        }
        
    }return ifreq;   

}

int main()
{
    int iNum = 0,iCount = 0,iValue = 0, iRet = 0;
    IPTR ptr = NULL;

    printf("Enter the size of an array:\n");
    scanf("%d",&iNum);

    ptr = (IPTR) malloc(iNum * sizeof(int));

    for(iCount = 0; iCount < iNum; iCount++)
    {
        scanf("%d",&ptr[iCount]);

    }
    printf("Enter the number which frequency need to be measure:\n");
    scanf("%d",&iValue);

    iRet = CountFrequency(ptr,iCount,iValue);
    printf("The frequency of given number is: %d\n",iRet);



    return 0;
}