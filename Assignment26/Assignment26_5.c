/*  input    =   8

    output  =  2    4   6   8   10  12  14  16
*/

#include<stdio.h>

void Table (int iNo)
{
    int iCnt = 0,i= 0;
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    for(iCnt = 1; iCnt <= iNo ; iCnt++)
    {
        i = 2 * iCnt;
        printf("%d\t",i);

    }
    printf("\n");
}

int main()
{
    int iValue = 0;
    printf("Enter the number:");
    scanf("%d",&iValue);

    Table(iValue);




    return 0;
}