#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>

typedef uint8_t BYTE;

int main(int argc, char *argv[])
{
    // Accept a single command-line argument
    if (argc != 2)
    {
        printf("Usage: ./recover FILE\n");
        return 1;
    }

    // Open the memory card
    FILE *card = fopen(argv[1], "r");

    if (card == NULL)
    {
        printf("File not Found\n");
        return 1;
    }

    // Create a buffer for a block of data
    BYTE buffer[512];

    // Create a output pointer, set to NULL
    FILE *outptr = NULL;

    // While there's still data left to read from the memory card
    int counter = 0;
    char *filename = malloc(8 * sizeof(char));

    while (fread(buffer, 1, 512, card) == 512)
    {
        // Create JPEGs from the data
        if (buffer[0] == 0xff && buffer[1] == 0xd8 && buffer[2] == 0xff &&
            (buffer[3] & 0xf0) == 0xe0)
        {
            // renew output pointer to process subsequent jpg
            if (outptr != NULL)
            {
                fclose(outptr);
            }

            sprintf(filename, "%03i.jpg", counter);
            counter++;
            outptr = fopen(filename, "w");
        }

        // headers of jpg not detected, proceed to write outptr file
        if (outptr != NULL)
        {
            fwrite(buffer, 1, 512, outptr);
        }
    }

    // close last opened outptr
    if (outptr != NULL)
    {
        fclose(outptr);
    }

    fclose(card);
    free(filename);

    return 0;
}
