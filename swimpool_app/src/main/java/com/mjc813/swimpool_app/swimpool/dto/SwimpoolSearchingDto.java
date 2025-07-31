package com.mjc813.swimpool_app.swimpool.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SwimpoolSearchingDto extends SwimpoolDto {
    private Integer curPage;
    private Integer rowsPage;
    private Integer offset;
    private Integer totalRow;

    public Integer getCurPage() {
        return this.curPage == null || this.curPage <= 1 ? 1 : this.curPage;
    }

    public Integer getTotalRow() {
        return this.totalRow == null || this.totalRow <= 0 ? 0 : this.totalRow;
    }

    public Integer getRowsPage() {
        return this.rowsPage == null || this.rowsPage <= 3 ? 3 : this.rowsPage >= 31 ? 30 : this.rowsPage;
    }

    public Integer getOffset() {
        return (this.getCurPage()-1) * this.getRowsPage();
    }
}
