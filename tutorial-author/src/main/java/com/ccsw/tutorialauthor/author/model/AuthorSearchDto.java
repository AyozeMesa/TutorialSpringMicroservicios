package com.ccsw.tutorialauthor.author.model;

import com.ccsw.tutorialauthor.common.pagination.PageableRequest;

/**
 * 
 * @author amesanun
 *
 */
public class AuthorSearchDto {

    private PageableRequest pageable;

    public PageableRequest getPageable() {
        return pageable;
    }

    public void setPageable(PageableRequest pageable) {
        this.pageable = pageable;
    }

}
