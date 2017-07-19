package com.none.model;

import java.io.Serializable;

public class Book implements Serializable {
    /**
     * 图书ID
    *@mbg.generated
     */
    private Long bookId;

    /**
     * 图书名称
    *@mbg.generated
     */
    private String name;

    /**
     * 馆藏数量
    *@mbg.generated
     */
    private Integer number;

    /**
     * book
    *@mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 图书ID
     * @return book_id 图书ID
    *@mbg.generated
     */
    public Long getBookId() {
        return bookId;
    }

    /**
     * 图书ID
     * @param bookId 图书ID
    *@mbg.generated
     */
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    /**
     * 图书名称
     * @return name 图书名称
    *@mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * 图书名称
     * @param name 图书名称
    *@mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 馆藏数量
     * @return number 馆藏数量
    *@mbg.generated
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 馆藏数量
     * @param number 馆藏数量
    *@mbg.generated
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
    *@mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Book other = (Book) that;
        return (this.getBookId() == null ? other.getBookId() == null : this.getBookId().equals(other.getBookId()));
    }

    /**
    *@mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBookId() == null) ? 0 : getBookId().hashCode());
        return result;
    }

    /**
    *@mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bookId=").append(bookId);
        sb.append(", name=").append(name);
        sb.append(", number=").append(number);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}