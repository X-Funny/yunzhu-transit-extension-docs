import { sidebar } from "vuepress-theme-hope";

export const enSidebar = sidebar({
  "/": [
    "",
    {
      text: "Document",
      icon: "book",
      prefix: "doc/",
      children: "structure",
    },
  ],
});

