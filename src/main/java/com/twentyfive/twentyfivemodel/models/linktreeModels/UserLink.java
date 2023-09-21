package com.twentyfive.twentyfivemodel.models.linktreeModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserLink {
    private String id;
    private String userId;
    private List<LinkTree> linkTrees;
}
