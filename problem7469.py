import sys

def quick_select(A, k):
    p = A[0]
    S = []
    M = []
    L = []

    for x in A:
        if p > x:
            S.append(x)
        elif p < x:
            L.append(x)
        else:
            M.append(x)

    if len(S) > k:
        return quick_select(S, k)
    elif len(S)+len(M) < k:
        return quick_select(L, k-len(S)-len(M))
    else:
        return p

n, m = map(int, sys.stdin.readline().split())

T = input().split(" ")

for a in range(m):
    i, j, k = map(int, sys.stdin.readline().split())

    L = T[i-1:j]

    print(quick_select(L, k))

    
