/*  input    =   5

    output  =  5    #   4   #   3   #   2   #   1   #
*/

#include<stdio.h>
void Pattern(int iNo)
{
    int iCnt = 0;
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    for(iCnt = iNo; iCnt > 0 ; iCnt--)
    {
        printf("%d\t#\t",iCnt);
    }
    printf("\n");
}
int main()
{
    int iValue = 0;
    printf("Enter the number:");
    scanf("%d",&iValue);

    Pattern(iValue);




    return 0;
}