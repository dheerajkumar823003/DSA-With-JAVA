#include<stdio.h>
int main(){
    int i,j,n;
    printf("Enter the number");
    scanf("%d",&n);
    for(i=1; i<=n; i++){
        for(j=i; j<n; j++){
            printf(" ");
        }
        for(j=1; j<=(i*2)-1; j++){
            printf("*");
        }
        printf("\n");
    }
    for(i=n; i>=1; i--){
        for(j=i; j<n; j++){
            printf(" ");
        }
        for(j=1; j<=(i*2)-1; j++){
            printf("*");
        }
        printf("\n");
    }
}