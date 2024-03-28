#include <iostream>
#include <vector>

int partition(std::vector<int> &arr, int start, int end) {
    int pivot = arr[end];
    int i = start - 1;
    int temp;

    for (int j = start; j < end; j++) {
        if (arr[j] < pivot) {
            temp = arr[++i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    temp = arr[++i];
    arr[i] = pivot;
    arr[end] = temp;
    return i;
}

void quickSort(std::vector<int> &arr, int start, int end) {
    if (end <= start) return;

    int pivot = partition(arr, start, end);
    quickSort(arr, start, pivot - 1);
    quickSort(arr, pivot + 1, end);
}

int main(int argc, char* argv[]) {
    std::vector<int> arr = {6,1,3,5,4,2};

    std::cout << "Before Sorting: " << std::endl;
    for (int i = 0; i < arr.size(); i++)
        std::cout << arr[i] << " ";

    quickSort(arr, 0, arr.size() - 1);

    std::cout << "\nAfter Sorting: " << std::endl;
    for (int i = 0; i < arr.size(); i++)
        std::cout << arr[i] << " ";
}
