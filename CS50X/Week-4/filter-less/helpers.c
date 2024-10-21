#include "helpers.h"
#include <math.h>

// Convert image to grayscale
void grayscale(int height, int width, RGBTRIPLE image[height][width])
{
    for (int i = 0; i < height; i++)
    {
        for (int j = 0; j < width; j++)
        {
            int avg =
                round((image[i][j].rgbtRed + image[i][j].rgbtBlue + image[i][j].rgbtGreen) / 3.0);
            image[i][j].rgbtRed = avg;
            image[i][j].rgbtBlue = avg;
            image[i][j].rgbtGreen = avg;
        }
    }

    return;
}

int convert(float sepia);

// Convert image to sepia
void sepia(int height, int width, RGBTRIPLE image[height][width])
{
    // Loop over all pixels
    for (int i = 0; i < height; i++)
    {
        for (int j = 0; j < width; j++)
        {
            // Compute sepia values
            float sepiaRed = 0.393 * image[i][j].rgbtRed + 0.769 * image[i][j].rgbtGreen +
                             0.189 * image[i][j].rgbtBlue;
            float sepiaGreen = 0.349 * image[i][j].rgbtRed + 0.686 * image[i][j].rgbtGreen +
                               0.168 * image[i][j].rgbtBlue;
            float sepiaBlue = 0.272 * image[i][j].rgbtRed + 0.534 * image[i][j].rgbtGreen +
                              0.131 * image[i][j].rgbtBlue;

            // Update pixel with sepia values
            image[i][j].rgbtRed = convert(sepiaRed);
            image[i][j].rgbtBlue = convert(sepiaBlue);
            image[i][j].rgbtGreen = convert(sepiaGreen);
        }
    }
    return;
}

int convert(float sepia)
{
    if (sepia >= 255)
    {
        return 255;
    }
    else
    {
        return round(sepia);
    }
}

void swap(BYTE *a, BYTE *b);

// Reflect image horizontally
void reflect(int height, int width, RGBTRIPLE image[height][width])
{
    // Loop over all pixels
    for (int i = 0; i < height; i++)
    {
        for (int j = 0; j < width / 2; j++)
        {
            // Swap pixels
            swap(&image[i][j].rgbtRed, &image[i][width - j - 1].rgbtRed);
            swap(&image[i][j].rgbtBlue, &image[i][width - j - 1].rgbtBlue);
            swap(&image[i][j].rgbtGreen, &image[i][width - j - 1].rgbtGreen);
        }
    }

    return;
}

void swap(BYTE *a, BYTE *b)
{
    BYTE tmp = *a;
    *a = *b;
    *b = tmp;
}

// Blur image
void blur(int height, int width, RGBTRIPLE image[height][width])
{
    // Create a copy of image
    RGBTRIPLE copy[height][width];
    for (int i = 0; i < height; i++)
    {
        for (int j = 0; j < width; j++)
        {
            copy[i][j].rgbtRed = image[i][j].rgbtRed;
            copy[i][j].rgbtBlue = image[i][j].rgbtBlue;
            copy[i][j].rgbtGreen = image[i][j].rgbtGreen;
        }
    }

    for (int i = 0; i < height; i++)
    {
        for (int j = 0; j < width; j++)
        {
            int count = 0;
            int avgR = 0;
            int avgG = 0;
            int avgB = 0;

            for (int k = (i - 1); k <= (i + 1); k++)
            {
                for (int m = (j - 1); m <= (j + 1); m++)
                {
                    if ((k >= 0 && k <= height-1) && (m >= 0 && m <= width-1))
                    {
                        avgR += copy[k][m].rgbtRed;
                        avgG += copy[k][m].rgbtGreen;
                        avgB += copy[k][m].rgbtBlue;
                        count++;
                    }
                }
            }

            image[i][j].rgbtRed = round((float) avgR / (float) count);
            image[i][j].rgbtGreen = round((float) avgG / (float) count);
            image[i][j].rgbtBlue = round((float) avgB / (float) count);
        }
    }
    return;
}
