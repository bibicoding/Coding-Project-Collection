// Implements a dictionary's functionality

#include "dictionary.h"
#include <ctype.h>
#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <strings.h>

// Represents a node in a hash table
typedef struct node
{
    char word[LENGTH + 1];
    struct node *next;
} node;

// TODO: Choose number of buckets in hash table
const unsigned int N = 10000;

// Hash table
node *table[N];

// Returns true if word is in dictionary, else false
bool check(const char *word)
{
    // find hash_value of word given
    int index = hash(word);

    // make traveser pointer
    node *travptr = table[index];

    while (travptr != NULL)
    {
        if (strcasecmp(travptr->word, word) == 0)
        {
            return true;
        }
        else
        {
            travptr = travptr->next;
        }
    }
    return false;
}

// Hashes word to a number
unsigned int hash(const char *word)
{
    unsigned int hash_value = 0;

    // Design hash function | Runtime : 0.65s
    for (int i = 0; i < strlen(word); i++)
    {
        hash_value += toupper(word[i]) * tolower(word[i]);
    }
    return hash_value % 10000;
}

int counter = 0;

// Loads dictionary into memory, returning true if successful, else false
bool load(const char *dictionary)
{
    // Open the dictionary file
    FILE *source = fopen(dictionary, "r");

    if (source == NULL)
    {
        return false;
    }

    char words[LENGTH];

    // Create node for new hash table & copy elements
    while (fscanf(source, "%s", words) != EOF)
    {
        node *n = malloc(sizeof(node));
        if (n == NULL)
        {
            return false;
        }
        strcpy(n->word, words);
        n->next = NULL;
        counter++;

        // Hash word to get index value
        int index = hash(n->word);

        // Insert new node to hash table
        if (table[index] == NULL)
        {
            table[index] = n;
        }
        else
        {
            n->next = table[index];
            table[index] = n;
        }
    }
    // Close the dictionary file
    fclose(source);
    return true;
}

// Returns number of words in dictionary if loaded, else 0 if not yet loaded
unsigned int size(void)
{
    return counter;
}

// Unloads dictionary from memory, returning true if successful, else false
bool unload(void)
{
    // make tmp pointer to store current position, and make travptr store the subsequent
    node *tmp = NULL;
    node *travptr = NULL;

    for (int i = 0; i < N; i++)
    {
        travptr = table[i];
        while (travptr != NULL)
        {
            tmp = travptr;
            travptr = travptr->next;
            free(tmp);
        }
    }
    return true;
}
