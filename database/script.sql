USE [loginmitrais]
GO
/****** Object:  Table [dbo].[jnskelamin]    Script Date: 01/09/2019 23:03:27 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[jnskelamin](
	[idkelamin] [int] NOT NULL,
	[jnskelamin] [varchar](50) NULL,
 CONSTRAINT [PK_jnskelamin] PRIMARY KEY CLUSTERED 
(
	[idkelamin] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[registrasi]    Script Date: 01/09/2019 23:03:27 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[registrasi](
	[idlogin] [int] NOT NULL,
	[namadepan] [varchar](100) NOT NULL,
	[nambelakang] [varchar](100) NOT NULL,
	[tgllahir] [varchar](50) NULL,
	[idkelamin] [int] NULL,
	[email] [varchar](50) NOT NULL,
	[nohp] [varchar](50) NOT NULL,
 CONSTRAINT [PK_registrasi] PRIMARY KEY CLUSTERED 
(
	[idlogin] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
