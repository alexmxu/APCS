public class SelectionSort extends StepCount
{
    // Sorts a[0], ..., a[size-1] in ascending order
    // using Selection Sort.
    public void sort( double[] a )
    {
        for ( int n = a.length; n > 1; n-- )
        {
            // Find the index iMax of the largest element
            // among a[0], ..., a[n-1]:
            addSteps(4);
            int iMax = 0;
            for ( int i = 1; i < n; i++ )
            {
                addSteps(3);
                if ( a[i] > a[iMax] )
                {
                    iMax = i;
                    addSteps(2);
                }
            }

            // Swap a[iMax] with a[n-1]:
            swap (a, iMax, n-1);
            addSteps(3);

            // Decrement n (accomplished by n-- in the for loop).
        }
    }
}
