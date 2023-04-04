package com.github.curriculeon;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 10/01/2019.
 * {a,b,c}
 * {
 *     {}
 *     {a}
 *     {b}
 *     {c}
 *     {a,b}
 *     {b,c}
 *     {a,b,c}
 * }
 *
 */
public class PowerSet<TypeOfSet> {
    TypeOfSet[] originalSet;

    public PowerSet(TypeOfSet[] originalSet) {
        this.originalSet = originalSet;
    }

    /**
     * @return the powerset of `originalSet`
     */
    public Set<Set<TypeOfSet>> permute() {
        Set<Set<TypeOfSet>> powerSet = new HashSet<>();
        powerSet.add(new HashSet<>());

        for (int i = 0; i < originalSet.length; i++) {

            for (int j = 1; j < originalSet.length; j++) {

            }

        }


        return null;
    }

    /**
     * @return `originalSet`
     */
    public Set<TypeOfSet> getOriginalSet() {
        Set<TypeOfSet> set = new HashSet<>();
        for (TypeOfSet val:originalSet) {
            set.add(val);
        }

        return set;
    }
}
