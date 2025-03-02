/*
48page4.3
给定正整数数组A=[93,23,8,46,26,43,6,97]
分别使用插入排序，快速排序，合并排序对该数组进行排序。
请图示各个算法执行的详细过程。
*/
/*
插入排序
初始: [93,23,8,46,26,43,6,97]
插入23: [23,93,8,46,...]
插入8: [8,23,93,46,...]
插入46: [8,23,46,93,...]
插入26: [8,23,26,46,93,...]
插入43: [8,23,26,43,46,93,...]
插入6: [6,8,23,26,43,46,93,97]
插入97: 不变
 */
/*
快速排序
初始分区（93） → [6,23,8,46,26,43,93,97]
左子数组分区（6） → [6,23,8,46,26,43]
左子数组分区（23） → [8,23,46,26,43]
右子数组分区（46） → [26,43,46]
合并后得到有序数组。
 */
/*
归并排序
合并 [23,93] 和 [8,46] → [8,23,46,93]
合并 [26,43] 和 [6,97] → [6,26,43,97]
最终合并 → [6,8,23,26,43,46,93,97]
 */
