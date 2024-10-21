#include <cs50.h>
#include <ctype.h>
#include <math.h>
#include <stdio.h>
#include <string.h>

int count_letters(string text);
int count_words(string text);
int count_sentences(string text);

int main(void)
{
    // Prompt the user for some text
    string text = get_string("Text: ");

    // Count the number of letters, words, and sentences in a text
    int letters = count_letters(text);
    int words = count_words(text);
    int sentences = count_sentences(text);

    // Compute the Coleman-Liau index
    double index = 0.0588 * ((double) letters / (double) words) * 100 -
                   0.296 * ((double) sentences / (double) words) * 100 - 15.8;

    // Print the grade level
    if (index < 1)
    {
        printf("Before Grade 1\n");
    }
    else if (index > 16)
    {
        printf("Grade 16+\n");
    }
    else
    {
        printf("Grade %.0f\n", round(index));
    }
}

int count_letters(string text)
{
    // Return the number of letters in the text
    int sum = 0;
    for (int i = 0, length = strlen(text); i < length; i++)
    {
        if (isalpha(text[i]))
        {
            sum++;
        }
    }
    return sum;
}

int count_words(string text)
{
    // Return the number of words in the text
    int sum = 0;
    for (int i = 0, length = strlen(text); i < length; i++)
    {
        if (isblank(text[i]))
        {
            sum++;
        }
    }
    return sum+1;
}

int count_sentences(string text)
{
    // Return the number of sentences in the text
    int sum = 0;
    for (int i = 0, length = strlen(text); i < length; i++)
    {
        if (text[i] == '.' || text[i] == '?' || text[i] == '!')
        {
            sum++;
        }
    }
    return sum;
}
