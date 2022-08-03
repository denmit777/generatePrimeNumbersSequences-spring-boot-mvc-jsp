package org.training.generate.model;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Data {

    private int length;
    private List<int[]> allSequences;
    private Map<Integer, String> sequencesView;
    private List<Integer> autoSequences;
    private Map<Integer, String> autoSequenceView;
    private Map<Integer, Set<Integer>> generateSequences;
}
