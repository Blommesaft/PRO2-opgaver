package fletning;

import java.util.ArrayList;

public class FletteSorteringHul {

	// den metode der saetter fletningen i gang
	public void fletteSort(ArrayList<Integer> list) {
		mergesort(list, 0, list.size() - 1);
	}

	// den rekursive metode der implementere del-loes og kombiner skabelonen
	private void mergesort(ArrayList<Integer> list, int l, int h) {
		if (l < h) {
			int m = (l + h) / 2;
			mergesort(list, l, m);
			mergesort(list, m + 1, h);
			merge(list, l, m, h);
		}
	}

	// kombiner er realiseret ved fletteskabelonen
	private void merge(ArrayList<Integer> list, int low, int middle, int high) {

        // Find sizes of two subarrays to be merged
        int n1 = middle - low + 1;
        int n2 = high - middle;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = list.get(low + i);
        for (int j = 0; j < n2; ++j)
            R[j] = list.get(middle + 1 + j);

        int i1 = 0;
        int i2 = 0;
        int k = low;

        while (i1 < n1 && i2 < n2) {
            if (L[i1] <= R[i2]) {
                list.set(k, L[i1]);
                i1++;
            } else {
                list.set(k, R[i2]);
                i2++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i1 < n1) {
            list.set(k, L[i1]);
            i1++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (i2 < n2) {
            list.set(k, R[i2]);
            i2++;
            k++;
        }
	}

}
