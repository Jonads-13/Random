#include <stdio.h>
#include <time.h>

int main(int argc, char** argv)
{
    time_t rawtime;
    struct tm * timeinfo;
    time( &rawtime );
    timeinfo = localtime( &rawtime );
    printf("%02d:%02d:%02d\n", timeinfo->tm_hour, timeinfo->tm_min, 
    timeinfo->tm_sec);

    return 0;
}