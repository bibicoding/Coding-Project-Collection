void invert()
{
  list_pointer forward;
  current = NULL;
  forward = head->next;
  while (forward != NULL){
    previous = current;
    current = forward;
    forward = forward->next;
    current->next = previous;
  }
  head->next = current;
}