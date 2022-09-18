package com.codeforcers.demi.algo.leetcode.tree;

import com.codeforcers.demi.annotation.CodeFactor;
import com.codeforcers.demi.annotation.LeetCode;
import com.codeforcers.demi.data.narray.Node;
import com.codeforcers.demi.enums.Complexity;
import com.codeforcers.demi.enums.Difficulty;
import com.codeforcers.demi.enums.ProblemType;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
 *<p></p>
 * Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)
 */
@LeetCode(value = 589, difficulty = Difficulty.EASY)
@CodeFactor(time = Complexity.ON, space = Complexity.ON, type = ProblemType.Tree)
public class NArrayTreeTraversal {

    /**
     * Straight forward as it can be, nothing much to work here
     * @param root root value
     * @return list of pre order values of the node.
     */
    public List<Integer> preorder(Node root) {
        return preOrder(root, new ArrayList<>());
    }

    public List<Integer> preOrder(Node root, List<Integer> values) {
        if(root != null) {
            values.add(root.val);
            for(Node child : root.children) {
                preOrder(child, values);
            }
        }
        return values;
    }
}
